DROP TABLE IF EXISTS media;

CREATE TABLE media (
  id INT PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL,
  DESCRIPTION VARCHAR(512) NOT NULL,
  SOURCE VARCHAR(250) NOT NULL,
  AUDIO VARCHAR(250) NOT NULL,
  IMAGE VARCHAR(250),
  TITLE VARCHAR(250) NOT NULL
);

INSERT INTO media (ID, NAME, DESCRIPTION, SOURCE, AUDIO, IMAGE, TITLE) VALUES
  (1, 'Brain Sparks', 'This podcast is hosted by usability and UI design expert, Jared Spool. It offers tona of value with many industry leaders sharing insights on usability, UX design, and UI design.', 'https://www.uie.com/brainsparks/topics/podcasts/', 'https://downloads.uie.fm/7/389/asset.uie.com/BSAL/UIEP015_Shipe_Goodwin.mp3', 'https://uie.fm/assets/album-art/the-uie-podcast.png', 'The Tension of Art and Science When Communicating Complex User Research'),
  (2, 'The Dirt Show', 'The Dirt Show is a podcast hosted by the team behind the UX design agency, Fresh Tilled Soil. One cool thing about this podcast is some topics follow a mini-series format, with multiple episodes and different guests talking about the same topic. For example, they have a mini-series on topics such as \"designing your career\" and \"designing the future\".', 'http://www.freshtilledsoil.com/category/podcast/', 'http://traffic.libsyn.com/thedirt/James_Aylward_-_Final.mp3', '', 'Data-Driven Design with James Aylward of Pluralsight'),
  (3, 'UX Podcast', 'UX Podcast is for people passionate about balancing business, technology and users within the realm of digital media. Moving the conversation beyond the traditional realm of User Experience.', 'http://uxpodcast.com/', 'https://content.blubrry.com/uxpodcast/uxpodcast-episode-253-derek-featherstone.mp3', 'https://3u9ouc3rh80mit7dp2jeoxqa-wpengine.netdna-ssl.com/wp-content/uploads/2020/12/253-derek-featherstone-uxpodcast-logo-gubben-768x768.jpg', 'The state of accessibility with Derek Featherstone');