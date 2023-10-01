import {useState, useEffect} from "react";
import {deleteRecord, getRequests} from "../http";
import {BasicAccordion} from "../components/BasicAccordion";

export const AdminPage = () => {
    const [records, setRecords] = useState([]);

    const getRecords = async () => {
        const records = await getRequests();
        return records;
    }

    useEffect(() => {
        getRecords()
            .then((res) => setRecords(res))
    }, [])

    return (
        <>
            {
                records.map((record) => <BasicAccordion record={record} /> )
            }
        </>
    )
}