import React from 'react';
import {Typography} from "@mui/material";
import Box from "@mui/material/Box";

const Problems = () => {
    return (
        <Box px={{height: '100vh', display: 'flex', flexDirection: 'column', justifyContent: 'center', alignItems: 'center'}}>
            <Typography variant="h4">
                Какие проблемы решаем
            </Typography>
        </Box>
    );
};

export default Problems;