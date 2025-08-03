import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data/bookData';
import { blogs } from './data/blogData';
import { courses } from './data/courseData';
import './App.css';

function App() {

  const [view, setView] = useState('all');
  const renderCourseDetails = () => {
    if (view === 'all' || view === 'courses') {
      return <CourseDetails courses={courses} />;
    } else {
      return <div className="placeholder">Courses are hidden</div>;
    }
  };

  return (
    <div className="App">
      <h1>Blogger App</h1>
      <p>Demonstrating Conditional Rendering</p>

      <div className="controls">
        <button onClick={() => setView('all')}>Show All</button>
        <button onClick={() => setView('books')}>Show Only Books</button>
        <button onClick={() => setView('blogs')}>Show Only Blogs</button>
        <button onClick={() => setView('courses')}>Show Only Courses</button>
      </div>

      <div className="content-container">
        {view === 'all' || view === 'books' ? (
          <BookDetails books={books} />
        ) : (
          <div className="placeholder">Book Details are hidden</div>
        )}

        {(view === 'all' || view === 'blogs') && <BlogDetails blogs={blogs} />}
        {view !== 'all' && view !== 'blogs' && (
          <div className="placeholder">Blog Details are hidden</div>
        )}

        {renderCourseDetails()}
      </div>
    </div>
  );
}

export default App;