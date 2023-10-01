import { useInView } from "react-intersection-observer";

const Problems = () => {
  const { ref, inView } = useInView({
    threshold: 0.2,
    triggerOnce: true,
  });

  return (
    <div id="problem-block" className="container-black">
      <div
        ref={ref}
        className={`container ${
          inView ? "animation-bottom-end" : "animation-bottom-start"
        }`}
      >
        <h2 className="h2">Наши услуги</h2>
        <div className="problem">
          <div className="problem__item container-white">
            <div className="problem__img">
              <img src="/img/konsaltingsvg.svg" alt="" loading="lazy" />
            </div>
            <div className="problem__title">Консультация</div>
            <div className="problem__content">
              Подберем спецификации, определим места установки системы
              видеонаблюдения, составим проект
            </div>
          </div>{" "}
          <div className="problem__item container-white">
            <div className="problem__img">
              <img src="/img/install.svg" alt="" loading="lazy" />
            </div>
            <div className="problem__title">Установка</div>
            <div className="problem__content">
              Проведем монтаж систем видеонаблюдения с настройкой элементов
            </div>
          </div>{" "}
          <div className="problem__item container-white">
            <div className="problem__img">
              <img src="/img/oborud.svg" alt="" loading="lazy" />
            </div>
            <div className="problem__title">Подбор оборудования</div>
            <div className="problem__content">
              Порекомендуем камеры, регистраторы, монтажные материалы
            </div>
          </div>{" "}
          <div className="problem__item container-white">
            <div className="problem__img">
              <img src="/img/service.svg" alt="" loading="lazy" />
            </div>
            <div className="problem__title">Сервис</div>
            <div className="problem__content">
              Гарантируем техническое и сервисное обслуживание систем
              видеонаблюдения
            </div>
          </div>
          <div className="problem__item container-white">
            <div className="problem__img">
              <img src="/img/camera.svg" alt="" loading="lazy" />
            </div>
            <div className="problem__title">Качество</div>
            <div className="problem__content">
            Мы предлагаем только высококлассное оборудование и профессиональную установку для непрерывного функционирования системы видеонаблюдения
            </div>
          </div>
          <div className="problem__item container-white">
            <div className="problem__img">
              <img src="/img/like.svg" alt="" loading="lazy" />
            </div>
            <div className="problem__title">Персонализация</div>
            <div className="problem__content">
            Мы создаем и устанавливаем индивидуальные системы видеонаблюдения, которые соответствуют вашим уникальным потребностям и целям.
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Problems;
