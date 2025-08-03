import React from 'react';
import ListofPlayers from './ListofPlayers';
import { OddPlayers, EvenPlayers, IndianPlayers } from './IndianPlayers';
function App() {
  const flag = true ;
  const playersList = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvraj5", "Raina6"];
  return (
    <div className="App">
      {flag ? (
        <ListofPlayers />
      ) : (
        <>
          <OddPlayers players = {playersList} />
          <EvenPlayers players = {playersList} />
          <IndianPlayers />
        </>
      )}
    </div>
  );
}
export default App;
