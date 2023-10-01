import { $authHost } from "./host";

export const createRecord = async (info) => {
    const { data } = await $authHost.post('/mainpage', {...info}, {withCredentials: true});
    return data;
}
