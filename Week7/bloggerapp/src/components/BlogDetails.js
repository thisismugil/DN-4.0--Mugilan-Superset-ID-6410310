import React from 'react';
const BlogDetails = ({ blogs }) => {
  return (
    <div className="component-box">
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id} className="item">
          <h3>{blog.title}</h3>
          <p><strong>{blog.author}</strong></p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;