import React from 'react';
import './App.css';
import img1 from "./assets/img-1.webp";
import img2 from "./assets/img-2.jpg";
import img3 from "./assets/img-3.webp";

function App() {
  const heading = "Office Space";
  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: img1
    },
    {
      Name: "WeWork",
      Rent: 70000,
      Address: "Bangalore",
      Image: img2
    },
    {
      Name: "Regus",
      Rent: 35000,
      Address: "Mumbai",
      Image: img3
    }
  ];
  return (
    <div className="App">
      <h1>{heading} , at Affordable Range</h1>
      {officeList.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index} style={{ marginBottom: "2rem" }}>
            <img src={item.Image} width="50%" alt="Office Space" />
            <h2>Name: {item.Name}</h2>
            <h3 className={rentColor}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}
export default App;
