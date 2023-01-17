INSERT INTO public.users(
	id, 
	created_at, 
	date_of_birth, 
	display_name, 
	first_name, 
	gender, 
	last_name, 
	password, 
	phone_number, 
	updated_at, 
	user_email, 
	is_deleted, 
	country_id, 
	role_id)
	
	VALUES (2, 
	current_timestamp, 
	'1994-04-01', 
	'Vibin Guevara', 
	'Vibin', 
	'Male', 
	'Guevara', 
	'12345', 
	'+91 8526363508', 
	current_timestamp, 
	'vibinces@gmail.com', 
	false, 
	2, 
	1);
	
	
	
INSERT INTO public.country(country_id, country) VALUES (2, 'Albania');