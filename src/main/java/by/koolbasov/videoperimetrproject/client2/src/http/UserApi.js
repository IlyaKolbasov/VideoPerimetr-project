import jwt_decode from 'jwt-decode';
import { $host } from "./host";

export const registration = async (user) => {
    const { data } = await $host.post('/userlog/registration', user);
    localStorage.setItem('token', data.token);
    return jwt_decode(data.token);
}

export const login = async (user) => {
    const { data } = await $host.post('/userlog/login', {email: user.email, password: user.password});
    localStorage.setItem('token', data.token);
    return jwt_decode(data.token);
}