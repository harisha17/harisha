import React, { Component } from "react";
import TaskService from "../TaskService";
import Home from '../Components/HomeComponent';

class AssignTask extends Component{

    constructor(props) {
        super(props)

        this.state = {
        taskId:'',
        ownerId:'',
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
        TaskService.assignTask(this.state.taskId,this.state.ownerId)
        .then(response => {
            console.log(response)
            this.setState({task:response.data})
        })
        .catch(error =>{
           console.log(error)
       })
    }

    render(){
        const{taskId,ownerId} = this.state
        return(
            <div>
                <Home></Home>
                <h2 style={{textAlign:"center"}}> Assign Task</h2>
                <fieldset>
                <form onSubmit={this.submitHandler} style={{textAlign:"center"}}>
                <div>
                        Task ID:
                        <input type="number"
                        name="taskId"
                        value={taskId}
                        onChange={this.changeHandler}
                        />
                    </div>
                    <div>
                        Owner ID:
                        <input type="number"
                        name="ownerId"
                        value={ownerId}
                        onChange={this.changeHandler}
                        />
                    </div>
                <button type="submit">Submit</button>  
                </form>
                </fieldset>
            </div>
        )
    
    }

    
}

export default AssignTask