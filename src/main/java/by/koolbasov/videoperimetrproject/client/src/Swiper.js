// Import Swiper React components
import { Autoplay, EffectFade, Navigation, Pagination, Thumbs } from "swiper";
import "swiper/css/bundle";
import { Swiper, SwiperSlide } from "swiper/react";

const MySwiper = () => {
  // const [thumbsSwiper, setThumbsSwiper] = useState(null);

  return (
    <Swiper
      id="swiper"
      modules={[EffectFade, Autoplay, Thumbs, Pagination, Navigation]}
      effect="fade"
      spaceBetween={0}
      slidesPerView={1}
      className="fade"
      autoplay={{
        delay: 4000,
        disableOnInteraction: false,
      }}
      pagination={{
        clickable: true,
      }}
      navigation={true}
      // loop={true}
      speed={500}
      // loopedSlides={3}
    >
      <SwiperSlide>
        <h2 className="swiper-heading h2">
          ы топ мКамеры топКамеры топКамеры топ Камеры топ{" "}
        </h2>
      </SwiperSlide>
      <SwiperSlide>
        <h2 className="swiper-heading h2">
          Камеры топ Камеры то топ мКамеры топКамеры топКамеры топ Камеры топ{" "}
        </h2>
      </SwiperSlide>
      <SwiperSlide>
        <h2 className="swiper-heading h2">
          Камеры амеры топКамеры топ Камеры топ{" "}
        </h2>
      </SwiperSlide>
    </Swiper>
  );
};

export default MySwiper;
