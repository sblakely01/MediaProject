const React = require('react');

class Media extends React.Component {
    render() {
        return (
            <tr>
                <td>{this.props.medias.name}</td>
                <td>{this.props.medias.description}</td>
                <td>{this.props.medias.title}</td>
            </tr>
        )
    }
}
export default Media;