import {$host} from "./index";

export const createRecord = async (info) => {
    const { data } = await $host.post('/', {...info});
    return data;
}
