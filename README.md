# xe_connector
[![License: AGPL v3](https://img.shields.io/badge/License-AGPL%20v3-blue.svg)](https://www.gnu.org/licenses/agpl-3.0)
[![Build Status](https://travis-ci.org/DataseekCN/xe_connector.svg?branch=master)](https://travis-ci.org/DataseekCN/xe_connector)
[![codebeat badge](https://codebeat.co/badges/ce6002d4-1a89-4d9c-a74d-317241147113)](https://codebeat.co/projects/github-com-dataseekcn-xe_connector-master)

## Project Structure

    xe_connector
    ├── .github                                     # Templates for issues, PR etc.
    ├── scripts                                     # All scripts run prior to the project start.
    ├── src                                         # Source files
        ├── main
            ├──java
                ├──info
                    ├──dataseek
                        ├──xe_connector
                            ├──config               # Configuration class(eg: SwaggerConfig.java)
                            ├──controller           # REST controller classes
                            ├──dataobject           # Entity classes
                            ├──dto                  # Data transfer object
                            ├──enums                # Enum types
                            ├──exceptions           # Customized exceptions
                            ├──repository           # DAO classes
                            ├──service              # Service classes
                                ├──implementation   # Concrete service classes
                            ├──utils                # Utility classes
                            ├──vo                   # View object
            ├──resources                            # Configuration files
        ├──test                                     # Unit tests