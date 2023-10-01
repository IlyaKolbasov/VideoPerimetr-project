import { $host } from "./host";

export const getRequests = async () => {
    const { data } = await $host.get('/admin');
    return data;
}

export const deleteRecord = async () => {
    const { data } = await $host.delete('/admin/delete')
}