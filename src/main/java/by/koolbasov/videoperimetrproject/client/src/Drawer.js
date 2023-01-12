import React, { useState } from "react";
import {
    Drawer,
    IconButton,
    List,
    ListItemButton,
    ListItemIcon,
    ListItemText,
} from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
const pages = ["О нас", "Запрос записей", "Контакты", "Войти"];
const DrawerComp = () => {
    const [openDrawer, setOpenDrawer] = useState(false);

    return (
        <React.Fragment>
            <Drawer
                anchor="right"
                open={openDrawer}
                onClose={() => setOpenDrawer(false)}
                // sx={{ background: "green"}}
            >
                <List sx={{width: '220px', pt: "15px"}}>
                    {pages.map((page, index) => (
                        <ListItemButton key={index} sx={{textAlign: "center", fontSize: "15px"}}>
                            <ListItemIcon>
                                <ListItemText>{page}</ListItemText>
                            </ListItemIcon>
                        </ListItemButton>
                    ))}
                </List>
            </Drawer>
            <IconButton
                sx={{ color: "white", marginLeft: "auto" }}
                onClick={() => setOpenDrawer(!openDrawer)}
            >
                <MenuIcon color="white" />
            </IconButton>
        </React.Fragment>
    );
};

export default DrawerComp;