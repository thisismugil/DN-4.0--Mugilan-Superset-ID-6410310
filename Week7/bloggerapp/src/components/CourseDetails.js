import React from 'react';
const CourseDetails = ({ courses }) => {
  return (
    <div className="component-box">
      <h2>Course Details</h2>
      {courses.map((course) => (
        <div key={course.id} className="item">
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;