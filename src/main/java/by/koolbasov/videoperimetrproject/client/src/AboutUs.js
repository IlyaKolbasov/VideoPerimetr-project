import { useInView } from "react-intersection-observer";

const AboutUs = () => {
  const { ref, inView } = useInView({
    threshold: 0.2,
    triggerOnce: true,
  });
  return (
    <div className="container-white">
      <div
        ref={ref}
        className={`container ${
          inView ? "animation-bottom-end" : "animation-bottom-start"
        }`}
      >
        <div className="about-us-info">
          <div className="about-us-info__item">
            <div className="about-us-info__title">80%</div>
            <div className="about-us-info__content">
              клиентов работают с нами больше 4 лет
            </div>
          </div>
          <div className="about-us-info__item">
            <div className="about-us-info__title">24/7</div>
            <div className="about-us-info__content">
              онлайн доступ к камерам с любого устройства
            </div>
          </div>
          <div className="about-us-info__item">
            <div className="about-us-info__title">7500+</div>
            <div className="about-us-info__content">
              камер видеонаблюдения установлено
            </div>
          </div>
          <div className="about-us-info__item">
            <div className="about-us-info__title">10 лет</div>
            <div className="about-us-info__content">
              гарантийное обслуживание
            </div>
          </div>
          <div className="about-us-info__item">
            <div className="about-us-info__title">80%</div>
            <div className="about-us-info__content">
              клиентов работают с нами больше 4 лет
            </div>
          </div>
          <div className="about-us-info__item">
            <div className="about-us-info__title">80%</div>
            <div className="about-us-info__content">
              клиентов работают с нами больше 4 лет
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AboutUs;
