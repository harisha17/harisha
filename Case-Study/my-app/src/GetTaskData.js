import React,{Component} from 'react';
import axios from 'axios';
import Home from './Components/HomeComponent';

class GetTaskData extends Component{
    constructor(props){
        super(props)
        this.state={
            tasks:[]
        }
      
    }
    componentDidMount(){
        axios.get('http://localhost:8090/restalltask')
        .then(response => this.setState({tasks:response.data}))
    }
    
    render(){
        return(
            <div>
                <Home></Home>
            <h2 className="text-center"> Task List</h2>
            <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                 <th>TaskID</th>
                                 <th>Name</th>
                                 <th>OwnerID</th>   
                                 <th>CreatorID</th>    
                                 <th>Status</th>   
                                 <th>Description</th>  
                                 <th>Priority</th>
                                 <th>Notes</th>
                                 <th>BookMarked</th>
                                 <th>Created</th>
                                 <th>Status Changed</th>
                                </tr>
                            </thead>
                            <tbody>
                {this.state.tasks.map(task =>(<tr key={task.taskID}>
                    <td>{task.taskId}</td> 
                    <td>{task.name}</td>
                    <td>{task.ownerId}</td>
                    <td>{task.createdId}</td>
                    <td>{task.status}</td>
                    <td>{task.description}</td>
                    <td>{task.priority}</td>
                    <td>{task.notes}</td>
                    <td>{task.isbookMarked.toString()}</td>
                    <td>{task.createdOn}</td>
                    <td>{task.modifiedOn}</td>
                   
                   
                   
                   
                    </tr>))}
                    </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}
export default GetTaskData;