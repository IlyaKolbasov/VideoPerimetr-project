import React from "react";
import Box from "@mui/material/Box";
import { Typography } from "@mui/material";
import { useInView } from "react-intersection-observer";

const Heading = () => {
  const { ref, inView } = useInView({
    // threshold: 0,
    // triggerOnce: true,
  });

  return (
    <div id="heading" className="container-white">
      <div
        ref={ref}
        className={`container ${
          // inView ? "animation-bottom-end" : "animation-bottom-start"
          ""
        }`}
      >
        <h2 className="h1">Способствуем вашей безопасности</h2>
      </div>
    </div>
  );
};

export default Heading;
