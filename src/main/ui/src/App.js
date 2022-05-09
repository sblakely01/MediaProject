
import MediaList from './MediaList';
import { createFetch, base, parse } from 'http-client'


const React = require('react');
const ReactDOM = require('react-dom');



class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {medias: []};
  }

  componentDidMount() {
    const fetch = createFetch(base('/api/'), parse('json'))
    
    fetch('/medias').then(response => {
      this.setState({medias: response.entity._embedded.medias});
    
    });
  }
  render() {
    return (
      <div>
      {//<MediaList mediaList={this.state.medias}/>
      }
      {console.log(this.state.medias)}
      </div>

    )
  }
}

export default App;
