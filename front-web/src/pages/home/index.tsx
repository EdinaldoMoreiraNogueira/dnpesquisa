import React from 'react';
import { ReactComponent as SetaIcon } from '../../assets/Seta.svg'
import { ReactComponent as GameImage } from '../../assets/GAMER.svg'
import './style.css';


const Home = () => {
    return (
      <div className="home-container">
          <div className="home-text">
              <h1 className="home-text-title">
              Quais jogos a galera gosta mais?
              </h1>
              <h3 className="home-text-subtitle">
              Clique no botão abaixo e saiba quais são os jogos que os gamers estão escolhendo!
              </h3>
              <div className="home-actions">
                  <button className="home-btn">
                  QUERO SABER QUAIS SÃO
                  </button>
                  <div className="home-btn-icon">
                      <SetaIcon/>
                  </div>
              </div>
          </div>
          <GameImage className="home-image"/>
      </div> 

    );
}

export default Home;