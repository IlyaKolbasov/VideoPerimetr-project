
import LoginPage from "./LoginPage";
import MainPage from "./MainPage";
import {LOGIN_ROUTE, MAIN_ROUTE} from "./constants/routes";
import {Navigate, Route, Routes} from 'react-router-dom';

export const AppRouter = () => {
    return <Routes>
        <Route index element={<MainPage/>}/>
        <Route path={LOGIN_ROUTE} element={<LoginPage/>}/>
        <Route path="*" element={<Navigate to={MAIN_ROUTE} replace/>}/>
    </Routes>
};