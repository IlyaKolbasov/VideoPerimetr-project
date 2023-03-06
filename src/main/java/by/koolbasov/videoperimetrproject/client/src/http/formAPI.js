import {$authHost, $host} from "./index";
import axios from "axios";




export const createRecord = async (info) => {
    const { data } = await $authHost.post('/mainpage', {...info}, {withCredentials: true});
    return data;
}
