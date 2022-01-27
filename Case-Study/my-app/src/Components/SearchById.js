import React, { Component } from "react";
import TaskService from "../TaskService";
import Home from '../Components/HomeComponent';




class SearchById extends Component{

    constructor(props) {
        super(props)

        this.state = {
        taskId:'',
        task:''
        
        }
        this.changeHandler = this.changeHandler.bind(this);
       this.submitHandler=this.submitHandler.bind(this);
       
      
    }

    changeHandler(e){
        this.setState({[e.target.name]:e.target.value})
    }
    submitHandler(e){
        e.preventDefault()
        console.log(this.state)
        TaskService.getTaskByID(this.state.taskId)
        .then(response => {
            console.log(response)
            this.setState({task:response.data})
            
        })
        .catch(error =>{
           console.log(error)
       })
    }
   

    render(){
        const{taskId,task} = this.state
        return(
            <div>
                <Home></Home>
                <h2 style={{textAlign:"center"}}>Search task</h2>
                <form onSubmit={this.submitHandler} style={{textAlign:"center"}}>
                <div>
                        Task ID:
                        <input type="number"
                        name="taskId"
                        value={taskId}
                        onChange={this.changeHandler}
                        />
                    </div>
                    
                <button  type="submit">Search</button>
               
                
                   
                </form>
                <div>
                <ul>
                    <li>TaskId: {task.taskId}</li> 
                    <li>TaskName: {task.name}</li>
                    <li>TaskOwner: {task.ownerId}</li>
                    <li>Task CreatorID: {task.creatorId}</li>
                    <li>Task status: {task.status}</li>
                    <li>Description: {task.description}</li>
                    <li>notes: {task.notes}</li>
                    <li>statusChangedOn: {task.modifiedOn}</li>
                    <li>Priority: {task.priority}</li>
                    <li>bookMarked: {task.isBookmarked===true?"true":"false"}</li>
                    <li> createdon: {task.creatorOn}</li>
                    </ul>
            </div>
            </div>
        )
    
    }

    
}

export default SearchById