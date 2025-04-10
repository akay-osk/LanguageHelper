DROP TABLE IF EXISTS wordsList;

CREATE TABLE wordsList (
	--id (word ID) : Primary Key
	id serial PRIMARY KEY,
	--word (new foreign word) :Not Null
	word varchar(255) NOT NULL,
	--pronuntiation 
	pronunciation varchar(255),
	--partOfSpeech
	partOfSpeech varchar(50),
	--translation (translation in English) :Not Null
	translation varchar(255) NOT NULL,
	--created_at (created time)
	created_at timestamp without time zone,
	--updated_at (updated time)
	updated_at timestamp without time zone
);