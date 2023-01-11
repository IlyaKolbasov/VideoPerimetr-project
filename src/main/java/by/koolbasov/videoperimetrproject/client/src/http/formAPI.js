import {$host} from "./service";


export const createRecord = async (info) => {
    const { data } = await $host.post('recordRequest', {...info});
    return data;
}