import React from 'react';
import Post from './Post';
class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false,
            errorMessage: ''
        };
    }
    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const postObjects = data.map(item => new Post(item.id, item.title, item.body));
                this.setState({ posts: postObjects });
            })
            .catch(error => {
                console.error('Error:', error);
                this.setState({ hasError: true, errorMessage: error.message });
            });
    }
    componentDidMount() {
        this.loadPosts();
    }
    componentDidCatch(error, info) {
        console.error('Render error:', error);
        this.setState({ hasError: true, errorMessage: error.toString() });
    }
    render() {
        if (this.state.hasError) {
            return <div>Error loading posts: {this.state.errorMessage}</div>;
        }
        return (
            <div>
                <h1>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ marginBottom: '20px' }}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}
export default Posts;
