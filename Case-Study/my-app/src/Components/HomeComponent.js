import React from "react";
import{Route,Link,BrowserRouter as Router,Routes} from 'react-router-dom';
export default function Home()
{
    return(
        <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" >
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
{/*            
            <li class="nav-link-active">
                <Link to="/tasks" class="nav-link" >All Tasks</Link>
            </li> */}

            <li class="nav-item">
                <Link to="/create" class="nav-link" >Create Task</Link>
            </li>

            {/* <li class="nav-item">
                <Link to="/assign" class="nav-link" >Assign Task</Link>
            </li>

            <li class="nav-item">
                <Link to="/search" class="nav-link" >SearchByID</Link>
            </li>

            <li class="nav-item">
                <Link to="/track" class="nav-link" >TrackStatus</Link>
            </li> */}
            </ul>
            </div>
            </nav>
        </div>
    
    )
}