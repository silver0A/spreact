import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
  const [test, setTest] = useState();

  useEffect(() => {
    axios.post('/api/test', {param1: (new Date()).toString()})
    .then(({data}) => setTest(data))
    .catch(error => console.log(error))
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        Hello {test}
      </header>
    </div>
  );
}

export default App;
