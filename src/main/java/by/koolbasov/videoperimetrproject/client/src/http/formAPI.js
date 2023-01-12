import {$host} from "./index";

export const createRecord = async (info) => {
    const { data } = await $host.post('record/create', {...info});
    return data;
}
