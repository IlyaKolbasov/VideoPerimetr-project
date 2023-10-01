import * as React from 'react';
import Accordion from '@mui/material/Accordion';
import AccordionSummary from '@mui/material/AccordionSummary';
import AccordionDetails from '@mui/material/AccordionDetails';
import Typography from '@mui/material/Typography';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import {IconButton} from "@mui/material";
import CloseIcon from '@mui/icons-material/Close';
import {deleteRecord} from "../../http";

export function BasicAccordion({ record }) {

    const { firstName, lastName, city, street, buildingNumber, flatNumber, fromDate, fromTime, toDate, toTime } = record;

    const handleDelete = async() => {
        const result = await deleteRecord()
    }

    return (
        <div>
            <Accordion>
                <AccordionSummary
                    expandIcon={<ExpandMoreIcon />}
                    aria-controls="panel1a-content"
                    id="panel1a-header"
                    style={{ display: 'flex' }}
                >
                    <Typography>{ `${lastName} ${firstName} - ${city}` }</Typography>
                    <IconButton aria-label="delete" style={{ color: 'red' }} onClick={handleDelete}>
                        <CloseIcon />
                    </IconButton>
                </AccordionSummary>
                <AccordionDetails>
                    <Typography>
                        { `Город - ${city}` }
                    </Typography>
                    <Typography>
                        { `Адрес - ${city}, ${street}, ${buildingNumber}, ${flatNumber}` }
                    </Typography>
                    <Typography>
                        { `Период: с ${fromDate}, ${fromTime} по ${toDate}, ${toTime}` }
                    </Typography>
                </AccordionDetails>
            </Accordion>
        </div>
    );
}
