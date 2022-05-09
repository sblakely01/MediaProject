import Media from './Media';

const React = require('react');

class MediaList extends React.Component{
    render() {
        const medias = this.props.medias.map(media =>
            <Media key={media._links.self.href} media={media}/>
            );
            return (
                <table>
                    <tbody>
                        <tr>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Title</th>
                        </tr>
                        {medias}
                    </tbody>
                </table>
            )
    }
}
export default MediaList;