import {$host} from "./index";
import axios from "axios";


axios.defaults.headers.post['Authorization'] = `Bearer ${localStorage.getItem('token')}`;

export const createRecord = async (info) => {
    const { data } = await $host.post('/mainpage', {...info});
    return data;
}
