import React, { useState, useEffect } from "react";
import {
  AppBar,
  Button,
  IconButton,
  Tab,
  Tabs,
  Toolbar,
  Typography,
  useMediaQuery,
  useTheme,
  Modal,
  Box,
  Backdrop,
  Fade,
} from "@mui/material";
import AddBusinessRoundedIcon from "@mui/icons-material/AddBusinessRounded";
import DrawerComp from "./Drawer";
import PersonIcon from "@mui/icons-material/Person";
// import image from "./static/background.jpeg";
import Logo from "./Logo";
import { Link, animateScroll as scroll } from "react-scroll";
import LoginPage from "./LoginPage";

let previousScroll = 0;

const style = {
  position: "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 700,
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
};

const Header = () => {
  const [value, setValue] = useState();
  const theme = useTheme();
  const isMatch = useMediaQuery(theme.breakpoints.down("md"));

  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const handleClose = () => setOpen(false);

  useEffect(() => {
    window.addEventListener("scroll", isSticky);
    return () => {
      window.removeEventListener("scroll", isSticky);
    };
  }, []);

  const isSticky = (e) => {
    const header = document.querySelector("header");
    const scrollTop = window.scrollY;
    scrollTop <= 250
      ? header.classList.remove("header-hidden")
      : header.classList.add("header-hidden");
    previousScroll >= scrollTop
      ? header.classList.remove("header-hidden")
      : header.classList.add("header-hidden");
    if (scrollTop < 0) header.classList.remove("header-hidden");
    previousScroll = scrollTop;
  };

  return (
    <>
      <div>
        <Button onClick={handleOpen}>Open modal</Button>
        <Modal
          aria-labelledby="transition-modal-title"
          aria-describedby="transition-modal-description"
          open={open}
          onClose={handleClose}
          closeAfterTransition
          slots={{ backdrop: Backdrop }}
          slotProps={{
            backdrop: {
              timeout: 500,
            },
          }}
        >
          <Fade in={open}>
            <Box sx={style}>
              <LoginPage />
            </Box>
          </Fade>
        </Modal>
      </div>

      <React.Fragment>
        <AppBar
          sx={{ boxShadow: "none", background: "none", position: "relative" }}
        >
          <Toolbar
            sx={{ height: "100px", marginLeft: "60px", marginRight: "60px" }}
          >
            <Link
              to="swiper"
              spy={true}
              smooth={true}
              offset={-100}
              duration={500}
            >
              <Logo />
            </Link>
            {isMatch ? (
              <>
                <DrawerComp />
              </>
            ) : (
              <>
                <Tabs
                  sx={{ marginLeft: "auto", marginRight: "auto" }}
                  // indicatorColor="secondary"
                  disableFocusRipple
                  textColor="white"
                  value={value}
                  onChange={(e, value) => setValue(value)}
                >
                  <Link
                    to="about-us-block"
                    spy={true}
                    smooth={true}
                    offset={-70}
                    duration={500}
                  >
                    <Tab
                      label="О нас"
                      sx={{ textTransform: "none", fontSize: "15px" }}
                    />
                  </Link>
                  <Link
                    to="problem-block"
                    spy={true}
                    smooth={true}
                    offset={-70}
                    duration={500}
                  >
                    <Tab
                      label="Наши услуги"
                      sx={{ textTransform: "none", fontSize: "15px" }}
                    />
                  </Link>
                  <Link
                    to="sign-up"
                    spy={true}
                    smooth={true}
                    offset={-70}
                    duration={500}
                  >
                    <Tab
                      label="Запрос записей"
                      sx={{ textTransform: "none", fontSize: "15px" }}
                    />
                  </Link>
                  <Link
                    to="contact"
                    spy={true}
                    smooth={true}
                    offset={-70}
                    duration={500}
                  >
                    <Tab
                      label="Контакты"
                      sx={{ textTransform: "none", fontSize: "15px" }}
                    />
                  </Link>
                </Tabs>
                <IconButton>
                  <PersonIcon sx={{ color: "white" }} onClick={handleOpen} />
                </IconButton>
              </>
            )}
          </Toolbar>
        </AppBar>
      </React.Fragment>
    </>
  );
};

export default Header;
