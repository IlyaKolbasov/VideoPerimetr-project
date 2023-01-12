import React from 'react';
import {Stack, Typography} from "@mui/material";
import LocalPhoneIcon from '@mui/icons-material/LocalPhone';
import EmailIcon from '@mui/icons-material/Email';
import LocationOnIcon from '@mui/icons-material/LocationOn';
import Logo from "./Logo";


const Footer = () => {
    return (
        <Stack direction="row" spacing={8} sx={{
            justifyContent: 'center',
            alignItems: 'center',
            height: '150px',
            background: 'linear-gradient(#1B2A33, #000)',
            color: 'white'
        }}
               component="footer"
        >
            <Logo />
            <Stack>

            </Stack>
            <Stack>
               <Stack direction="row" spacing={1}>
                   <LocalPhoneIcon />
                   <Typography>
                       +375 (29) 757-35-99
                   </Typography>
               </Stack>
                <Stack direction="row" spacing={1}>
                    <EmailIcon />
                    <Typography>
                        videoperimetr_by@mail.ru
                    </Typography>
                </Stack>

            </Stack>
            <Stack>
                <Stack direction="row" spacing={1}>
                    <Typography>
                        Время работы офиса
                    </Typography>
                </Stack>
                <Typography>
                    Пн-Пт 8:00 - 17:00
                </Typography>
                <Typography>
                    Обед 13:00 - 13:45
                </Typography>
            </Stack>
            <Stack>
                <Typography>г. Молодечно,</Typography>
                <Typography>
                    ул. Великий Гостинец,
                </Typography>
                <Typography>
                    д. 143б, каб. 556
                </Typography>
            </Stack>
        </Stack>
        );
};

export default Footer;