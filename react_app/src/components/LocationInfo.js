import React, { Component } from 'react'

export default class LocationInfo extends Component {
    state ={
        term:""
    }
    onFormSubmit = (event) =>{
        event.preventDefault();
        // this.props.onSubmit(this.state.term)
        console.log("Clicked!")
        
    }
    render() {
        return (
            <form onSubmit={this.onFormSubmit}>
            <div className="locationinfo">
            <div className="ui card">
                <div className="image">
                    <img src="/images/avatar2/large/kristy.png" alt="Welocme"/>
                </div>
                <div className="content">
                    <a className="header">Kristy</a>
                    <div className="meta">
                    <span className="date">Joined in 2013</span>
                    </div>
                    <div className="description">
                    Kristy is an art director living in New York.
                    </div>
                </div>
                <div className="extra content">
                    <a>
                    <i className="user icon"></i>
                    22 People currently booked thier visit here
                    </a>
                </div>
                <button type = "submit" className="ui secondary button">
                    Mark my visit
                </button>
            </div>
            </div>
            </form>
        )
    }
}
