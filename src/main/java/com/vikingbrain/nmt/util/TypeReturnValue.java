package com.vikingbrain.nmt.util;

/**
 * This section list down all the possible error code returned by command server.
 * @author vikingBrain
 *
 */
public enum TypeReturnValue {
	
	SUCCESS {
		public String getId() {
			return "0";
		}
		public String getDescription() {
			return "Success";
		}
	},

	UNKNOWN {
		public String getId() {
			return "-1";
		}
		public String getDescription() {
			return "Error description unknown";
		}
	},

	ERROR_CODE_1 {
		public String getId() {
			return "1";
		}
		public String getDescription() {
			return "Pending";
		}
	},
	
	ERROR_CODE_4 {
		public String getId() {
			return "4";
		}
		public String getDescription() {
			return "Error";
		}
	},
	
	ERROR_CODE_8 {
		public String getId() {
			return "8";
		}
		public String getDescription() {
			return "INVALID PARAMETER (Standard error, argument is null)";
		}
	},
	
	ERROR_CODE_11 {
		public String getId() {
			return "11";
		}
		public String getDescription() {
			return "INVALID_PATH (Standard error, database cannot open)";
		}
	},
	
	ERROR_CODE_22 {
		public String getId() {
			return "22";
		}
		public String getDescription() {
			return "Insufficient size";
		}
	},
	
	ERROR_CODE_49 {
		public String getId() {
			return "49";
		}
		public String getDescription() {
			return "DATABASE_WR_ERROR (Standard error, cannot write to database, in this command is cannot create table)";
		}
	},	
	
	ERROR_CODE_50 {
		public String getId() {
			return "50";
		}
		public String getDescription() {
			return "DATABASE_RD_ERROR (Standard error, cannot read from database)";
		}
	},	
	
	ERROR_CODE_51 {
		public String getId() {
			return "51";
		}
		public String getDescription() {
			return "Open pipe error";
		}
	},
	
	ERROR_CODE_52 {
		public String getId() {
			return "52";
		}
		public String getDescription() {
			return "Same file/record already exist";
		}
	},
	
	ERROR_CODE_57 {
		public String getId() {
			return "57";
		}
		public String getDescription() {
			return "No database is found";
		}
	},

	ERROR_CODE_60 {
		public String getId() {
			return "60";
		}
		public String getDescription() {
			return "Read only File system";
		}
	},

	ERROR_CODE_61 {
		public String getId() {
			return "61";
		}
		public String getDescription() {
			return "No internet connection";
		}
	},
	
	ERROR_CODE_62 {
		public String getId() {
			return "62";
		}
		public String getDescription() {
			return "No nmt harddisk connectted";
		}
	},

	ERROR_CODE_63 {
		public String getId() {
			return "63";
		}
		public String getDescription() {
			return "Database outdated";
		}
	},

	ERROR_CODE_64 {
		public String getId() {
			return "64";
		}
		public String getDescription() {
			return "Not even one directory is added";
		}
	},

	ERROR_CODE_65 {
		public String getId() {
			return "65";
		}
		public String getDescription() {
			return "Not even one directory is scanned yet";
		}
	},

	ERROR_CODE_401 {
		public String getId() {
			return "401";
		}
		public String getDescription() {
			return "Device no exist during doing file operation";
		}
	},

	ERROR_CODE_402 {
		public String getId() {
			return "402";
		}
		public String getDescription() {
			return "Devices permission denied during doing file operation";
		}
	},

	ERROR_CODE_403 {
		public String getId() {
			return "403";
		}
		public String getDescription() {
			return "Devices disk space full during doing file operation";
		}
	},

	ERROR_CODE_501 {
		public String getId() {
			return "501";
		}
		public String getDescription() {
			return "Duplicate entry during create download task process";
		}
	},

	ERROR_CODE_502 {
		public String getId() {
			return "502";
		}
		public String getDescription() {
			return "Fail to Parse seed during create download task process";
		}
	},

	ERROR_CODE_503 {
		public String getId() {
			return "503";
		}
		public String getDescription() {
			return "Invalid CID during create download task process";
		}
	},

	ERROR_CODE_504 {
		public String getId() {
			return "504";
		}
		public String getDescription() {
			return "Invalid Task ID";
		}
	},

	ERROR_CODE_505 {
		public String getId() {
			return "505";
		}
		public String getDescription() {
			return "Download Manager directory not found, cannot perform any action";
		}
	},

	ERROR_CODE_506 {
		public String getId() {
			return "506";
		}
		public String getDescription() {
			return "Download Manager license key fail, cannot perform any action";
		}
	},

	ERROR_CODE_601 {
		public String getId() {
			return "601";
		}
		public String getDescription() {
			return "Fail to install .There are another installation or updating process on run";
		}
	},

	ERROR_CODE_602 {
		public String getId() {
			return "602";
		}
		public String getDescription() {
			return "Application Id not found";
		}
	},

	ERROR_CODE_901 {
		public String getId() {
			return "901";
		}
		public String getDescription() {
			return "Access deny";
		}
	},

	ERROR_CODE_902 {
		public String getId() {
			return "902";
		}
		public String getDescription() {
			return "Internal failure";
		}
	},

	ERROR_CODE_903 {
		public String getId() {
			return "903";
		}
		public String getDescription() {
			return "Out of memory";
		}
	},

	ERROR_CODE_904 {
		public String getId() {
			return "904";
		}
		public String getDescription() {
			return "Fail to resolve hostname, server appears to be offline";
		}
	},

	ERROR_CODE_905 {
		public String getId() {
			return "905";
		}
		public String getDescription() {
			return "Share no longer exist";
		}
	},

	ERROR_CODE_906 {
		public String getId() {
			return "906";
		}
		public String getDescription() {
			return "Please retry";
		}
	},

	ERROR_CODE_907 {
		public String getId() {
			return "907";
		}
		public String getDescription() {
			return "Server is busy, unable to access now";
		}
	},

	ERROR_CODE_908 {
		public String getId() {
			return "908";
		}
		public String getDescription() {
			return "Unable login to target server, please retry";
		}
	},

	ERROR_CODE_909 {
		public String getId() {
			return "909";
		}
		public String getDescription() {
			return "Unable access to server, please check your server setup";
		}
	},

	ERROR_CODE_910 {
		public String getId() {
			return "910";
		}
		public String getDescription() {
			return "User/password required";
		}
	},

	ERROR_CODE_911 {
		public String getId() {
			return "911";
		}
		public String getDescription() {
			return "I/O error";
		}
	},

	ERROR_CODE_912 {
		public String getId() {
			return "912";
		}
		public String getDescription() {
			return "Host is unreachable";
		}
	},

	ERROR_CODE_913 {
		public String getId() {
			return "913";
		}
		public String getDescription() {
			return "No domain master browser";
		}
	},

	ERROR_CODE_914 {
		public String getId() {
			return "914";
		}
		public String getDescription() {
			return "No local master browser";
		}
	},

	ERROR_CODE_915 {
		public String getId() {
			return "915";
		}
		public String getDescription() {
			return "No workgroup list";
		}
	},

	ERROR_CODE_916 {
		public String getId() {
			return "916";
		}
		public String getDescription() {
			return "No server list";
		}
	},

	ERROR_CODE_917 {
		public String getId() {
			return "917";
		}
		public String getDescription() {
			return "No share list";
		}
	},

	ERROR_CODE_918 {
		public String getId() {
			return "918";
		}
		public String getDescription() {
			return "No more free mount point for new mount/access request";
		}
	};

	/**
	 * Abstract method get the id.
	 * @return id the id
	 */
	public abstract String getId();
	
	/**
	 * Abstract method get the description.
	 * @return description of the error
	 */
	public abstract String getDescription();

	/**
	 * Find the type return code by id.
	 * @param _id id of the code
	 * @return the return code or null if not found
	 */
	public static TypeReturnValue findById(String _id) {
		TypeReturnValue type = null;
	    for (TypeReturnValue actual : TypeReturnValue.values()) {
        	if(actual.getId().equals(_id)){
        		type = actual;
        	}
	    }
		return type;
	}	
	
}
