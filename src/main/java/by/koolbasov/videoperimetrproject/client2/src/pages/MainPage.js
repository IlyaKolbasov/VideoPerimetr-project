import React, {useEffect, useState} from "react";
import Header from "../components/Header";
import SignUp from "../components/Form";

import Box from "@mui/material/Box";
import Footer from "../components/Footer";
import Info from "../components/Info";
import Problems from "../components/Problems";
import Map from "../components/Map";
import AboutUs from "../components/AboutUs";
import MySwiper from "../components/Swiper";
import Heading from "../components/Heading";

export const MainPage = () => {
  const [user, setUser] = useState({});

  useEffect(() => {
      const user = JSON.parse(localStorage.getItem('user')) || {};
      setUser(user);
  }, [])


  return (
    <Box sx={{ fontFamily: "Noto Serif" }}>
      <Header user={user} setUser={setUser}/>
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

