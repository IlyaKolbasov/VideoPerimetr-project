import React from "react";
import Box from "@mui/material/Box";
import { Typography } from "@mui/material";
import { useInView } from "react-intersection-observer";

const Info = () => {
  const { ref, inView } = useInView({
    threshold: 0.2,
    triggerOnce: true,
  });

  return (
    <div id="about-us-block" className="container-white">
      <div
        ref={ref}
        className={`container ${
          inView ? "animation-bottom-end" : "animation-bottom-start"
        }`}
      >
        <div className="about-us-block__row-first">
          <div className="about-us-block-item-left">
            <h2 className="h2">Информация о нас</h2>
            <div className="problem__content">
              <p>
                В 2019 году группа компаний DVS стала лидерами рынка г. Минска,
                а уже в 2020 по всей Республике. Мы выбираем только лучшее
                оборудование и материалы у топовых поставщиков.
              </p>
              <br />
              <p>
                DVS имеет большое количество благодарностей от жителей,
                товариществ собственников, министерства ЖКХ, и МВД →
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Info;
