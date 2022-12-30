import {$host} from "./service";

export const registration = async ({firstName, lastName, email, password}) => {
    console.log({firstName, lastName, email, password})
    const { data } = await $host.post('registration', {firstName, lastName, email, password});
    return data;
}