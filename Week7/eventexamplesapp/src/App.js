import React, { useState } from 'react';
import CurrencyConverter from './CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  function handleIncrement() {
    setCount(prev => prev + 1);
    sayHello();
  }

  function handleDecrement() {
    setCount(prev => prev - 1);
  }

  function sayHello() {
    alert("Hello Member1");
  }

  function showWelcome(message) {
    alert(message);
  }

  function handleClick(e) {
    alert("I was clicked");
    console.log("Synthetic event:", e);
  }

  return (
    <div style={{ padding: '20px' }}>
      <h2>Counter: {count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <br/><br/>
      <button onClick={() => showWelcome("Welcome!")}>Say welcome</button>
      <br/><br/>
      <button onClick={handleClick}>Click on me</button>
      <br/><br/>
      <CurrencyConverter />
    </div>
  );
}

export default App;
