import React, { useState } from 'react';

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  function handleSubmit(e) {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      const converted = amount * 80;
      alert(`Converting to Euro Amount is ₹${converted}`);
    } else if (currency.toLowerCase() === 'rupees') {
      const converted = amount / 80;
      alert(`Converting to Rupees Amount is €${converted}`);
    } else {
      alert("Unsupported currency. Please type 'euro' or 'rupees'");
    }
  }

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount: </label>
        <input 
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)} 
          required 
        />
        <br />
        <label>Currency (euro/rupees): </label>
        <input 
          value={currency}
          onChange={(e) => setCurrency(e.target.value)} 
          required 
        />
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;
