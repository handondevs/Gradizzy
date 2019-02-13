import React from 'react';
import PropTypes from 'prop-types';
import classNames from 'classnames';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import IconButton from '@material-ui/core/IconButton';
import Typography from '@material-ui/core/Typography';
import InputBase from '@material-ui/core/InputBase';
import { withStyles } from '@material-ui/core/styles';
import MenuIcon from '@material-ui/icons/Menu';
import SearchIcon from '@material-ui/icons/Search';
import styles from './AppBar.style';

function SearchAppBar(props) {
  const { classes, onSideButtonClick, open } = props;
  return (
      <AppBar
        position="static"
        className={classes.AppBar}
      >
        <Toolbar classes={{root:classes.toolBar}}>
          <IconButton onClick={onSideButtonClick} 
          className={classNames(classes.menuButton, open && classes.hide)}
          color="inherit" aria-label="Open drawer">
            <MenuIcon />
          </IconButton>
          <Typography className={classes.title} variant="h6" color="inherit" noWrap>
            Material-UI
          </Typography>
          <div className={classes.grow} />
          <div className={classes.search}>
            <div className={classes.searchIcon}>
              <SearchIcon />
            </div>
            <InputBase
              placeholder="Search…"
              classes={{
                root: classes.inputRoot,
                input: classes.inputInput,
              }}
            />
          </div>
        </Toolbar>
      </AppBar>
  );
}

SearchAppBar.propTypes = {
  classes: PropTypes.object.isRequired,
  onSideButtonClick: PropTypes.func,
  open: PropTypes.bool,
};

SearchAppBar.defaultProps = {
  onSideButtonClick: () => {},
  open: true,
}

export default withStyles(styles)(SearchAppBar);