import React, { useEffect, useState } from "react";
import Header from "./Header";
import Container from "@mui/material/Container";
import { Paper, Typography } from "@mui/material";
import SignUp from "./Form";

// import image from "./static/background.jpeg";
import Box from "@mui/material/Box";
import Footer from "./Footer";
import Info from "./Info";
import Problems from "./Problems";
import Map from "./Map";
import AboutUs from "./AboutUs";
import MySwiper from "./Swiper";
import Heading from "./Heading";

const styles = {
  paperContainer: {
    // backgroundImage: `url(${image})`,
    maxWidth: "100vw",
    backgroundSize: "cover",
    height: "100vh",
    display: "flex",
    flexDirection: "column",
    justifyContent: "space-between",
    paddingTop: "80px",
  },
};

const MainPage = () => {
  return (
    <Box sx={{ fontFamily: "Noto Serif" }}>
      <Header />
      {/* <Paper style={styles.paperContainer}>
        <Box
          sx={{
            display: "flex",
            justifyContent: "center",
            alignItems: "center",
            pb: 2,
          }}
        >
          <Typography variant="h5" sx={{ color: "white" }}>
            УСЛУГА ПО ОБЕСПЕЧЕНИЮ БЕЗОПАСНОСТИ МНОГОКВАРТИРНЫХ ДОМОВ
          </Typography>
        </Box>
      </Paper> */}
      <MySwiper />
      <Heading/>
      <Info />
      <AboutUs />
      <Problems />
      <Map />
      <SignUp />
      <Footer />
    </Box>
  );
};

export default MainPage;
