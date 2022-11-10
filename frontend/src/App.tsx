import React, {useEffect} from 'react';
import './App.css';
import axios from "axios";

function App() {

    const [fish, setFish] = React.useState<string>();

    useEffect(() => {
        axios.get('/api/fish')
            .then(response => response.data)
            .then(data => setFish(data));
    }, []);

    return <>{fish}</>;
}

export default App;
