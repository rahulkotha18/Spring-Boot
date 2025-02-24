import React, { Component } from 'react';
import axios from 'axios'

class PostsList extends Component
    {
        constructor(props)
        {
            super(props)
            this.state={
                posts:[]
            }
        }
        componentDidMount()
        {
            axios.get("http://localhost:8080/api/employee")
            .then( response=>
                {console.log(response)
                   this.setState({
                        posts:response.data
                   })
                })
            .catch(error=>
                {console.log(error)})
        }
    render() {
        const { posts }=this.state
        return (
            <div>
               List of Posts
               {
                   posts.length ?
                   posts.map(post=> <div key={post.id}>{post.first_name}</div>):
                   null
               }
            </div>
        );
    }
}

export default PostsList;