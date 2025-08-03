import React from 'react';
const players = [
  { name: "Kane Williamson", score: 100 },
  { name: "Steve Smith", score: 70 },
  { name: "ABD", score: 40 },
  { name: "Joe Root", score: 61 },
  { name: "Conway", score: 61 },
  { name: "Sachin", score: 95 },
  { name: "Dhoni", score: 100 },
  { name: "Virat", score: 84 },
  { name: "Jadeja", score: 64 },
  { name: "Raina", score: 75 },
  { name: "Rohit", score: 80 },
];
export default function ListofPlayers() {
  const players70 = players.filter((item) => item.score <= 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>Mr. {item.name} <span>{item.score}</span></li>
        ))}
      </ul>

      <h3>List of Players having Scores Less than 70</h3>
      <ul>
        {players70.map((item, index) => (
          <li key={index}>Mr. {item.name}</li>
        ))}
      </ul>
    </div>
  );
}
