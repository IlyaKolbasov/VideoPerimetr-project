import { $host } from "./host";
import axios from "axios";
export const getRequests = async () => {
    const { data } = await axios.get('/admin');
    return data;
}

export const deleteRecord = async () => {
    const { data } = await axios.delete('/admin/delete')
}