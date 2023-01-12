import React from 'react';
import Box from "@mui/material/Box";
import {Typography} from "@mui/material";

const Info = () => {
    return (
        <Box px={{background: '#F6F6F6', height: '100vh', display: 'flex', flexDirection: 'column', justifyContent: 'center', alignItems: 'center'}}>
            <Typography variant="h4">
                Информация о нас
            </Typography>
        </Box>
    );
};

export default Info;