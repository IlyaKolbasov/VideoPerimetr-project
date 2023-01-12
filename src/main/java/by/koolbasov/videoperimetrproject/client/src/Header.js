import React, { useState } from "react";
import {
    AppBar,
    Button, IconButton,
    Tab,
    Tabs,
    Toolbar,
    Typography,
    useMediaQuery,
    useTheme,
} from "@mui/material";
import AddBusinessRoundedIcon from "@mui/icons-material/AddBusinessRounded";
import DrawerComp from "./Drawer";
import PersonIcon from '@mui/icons-material/Person';
import image from "./static/background.jpeg";
import Logo from "./Logo";

const Header = () => {
    const [value, setValue] = useState();
    const theme = useTheme();
    const isMatch = useMediaQuery(theme.breakpoints.down("md"));

    return (
        <React.Fragment>
            <AppBar sx={{boxShadow: 'none', background: 'none', position: 'relative' }}>
                <Toolbar sx={{height: '100px', marginLeft: '60px', marginRight: '60px'}}>
                    <Logo />
                    {isMatch ? (
                        <>
                            <DrawerComp />
                        </>
                    ) : (
                        <>
                            <Tabs
                                sx={{ marginLeft: "auto"}}
                                // indicatorColor="secondary"
                                disableFocusRipple
                                textColor="white"
                                value={value}
                                onChange={(e, value) => setValue(value)}
                            >
                                <Tab label="О нас" sx={{textTransform: "none", fontSize: "15px"}}/>
                                <Tab label="Запрос записей" sx={{textTransform: "none", fontSize: "15px", }}/>
                                <Tab label="Контакты" sx={{textTransform: "none", fontSize: "15px",}}/>
                            </Tabs>
                            <IconButton>
                                <PersonIcon sx={{color: "white"}} />
                            </IconButton>
                        </>
                    )}
                </Toolbar>
            </AppBar>
        </React.Fragment>
    );
};

export default Header;