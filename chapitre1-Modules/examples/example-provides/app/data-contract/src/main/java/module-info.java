module dataContract {
	exports models;
	exports Iservice;
	provides Iservice.AdressServiceI with ServiceImpl.AdressServiceImpl;
}