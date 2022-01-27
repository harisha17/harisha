import axios from 'axios';
const baseurl = "http://localhost:8090/restalltask";
class TaskService {

    createTask(Task){
        return axios.post('http://localhost:8090/restaddtask',Task);
    }
  
    // assignTask(taskID,ownerID)
    // {
    //     return axios.get('http://localhost:8090/updateownerid'+'/'+taskID+'/'+ownerID)
    // }
    // getTaskByID(taskID)
    // {
    //    return axios.get('http://localhost:8090/restgettask'+'/'+taskID)
    //  }
    //  SearchByStatus(status)
    // {
    //     return axios.get('http://localhost:8090/status'+'/'+status)
    // }
}

export default new TaskService()