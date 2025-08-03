import React from 'react';
const BookDetails = ({ books }) => {
  return (
    <div className="component-box">
      <h2>Book Details</h2>
      {books.map((book) => (
        <div key={book.id} className="item">
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
};

export default BookDetails;